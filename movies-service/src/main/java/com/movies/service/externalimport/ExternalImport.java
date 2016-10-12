package com.movies.service.externalimport;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.movies.service.externalimport.model.MoviesByGenre;

public class ExternalImport {

	private static boolean peticionar(int totalPages, int page) {
		int requestNumber = 0;
		while (page <= totalPages && requestNumber < 40) {
			System.out.println(requestNumber);
			System.out.println("page: " + page);
			requestNumber++;
			page++;
		}
		requestNumber = 0;
		return (page <= totalPages);
	}

	public static void main(String[] args) {

		// boolean continuar = true;
		// int page = 1;
		//
		// MoviesByGenre todo = new MoviesByGenre();
		// todo.setTotalPages(45);
		//
		// while(continuar){
		// continuar=peticionar(todo.getTotalPages(),page);
		// System.out.println("termino " + continuar);
		// }

		final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(new Runnable() {
			int reqNumber = 0;
			int page = 1;

			@Override
			public void run() {

				ResteasyClient client = (ResteasyClient) ResteasyClientBuilder.newBuilder().build();
				ResteasyWebTarget target = client.target(
						"https://api.themoviedb.org/3/genre/28/movies?api_key=dd9a73e551cee192b409dd2452ab5519&language=es-ES&sort_by=created_at.asc");
				target.request().accept(MediaType.APPLICATION_JSON);
				Response response = target.request().get();
				MoviesByGenre out = response.readEntity(MoviesByGenre.class);
				response.close();

				MoviesByGenre todo = new MoviesByGenre();
				todo.setTotalPages(45);
				while (page <= out.getTotalPages() && reqNumber < 39) {
					System.out.println("https://api.themoviedb.org/3/genre/28/movies?page=" + page);
					ResteasyWebTarget target1 = client
							.target("https://api.themoviedb.org/3/genre/28/movies?api_key=dd9a73e551cee192b409dd2452ab5519&language=es-ES"
									+ "&sort_by=created_at.asc&page=" + page);
					target.request().accept(MediaType.APPLICATION_JSON);
					Response response1 = target1.request().get();
					MoviesByGenre out1 = response1.readEntity(MoviesByGenre.class);
					response.close();
					System.out.println(out1.getResults().get(0).getOriginalTitle());
					System.out.println(out1.getPage());
					reqNumber++;
					page++;
				}
				reqNumber = 0;
				if (page >= todo.getTotalPages()) {
					service.shutdown();
					System.out.println("Se termino wacho");
				}
			}

		}, 0, 5, TimeUnit.SECONDS);

		// ResteasyClient client = (ResteasyClient)
		// ResteasyClientBuilder.newBuilder().build();
		// ResteasyWebTarget target =
		// client.target("https://api.themoviedb.org/3/genre/28/movies?api_key=dd9a73e551cee192b409dd2452ab5519&language=es-ES&sort_by=created_at.asc");
		// target.request().accept(MediaType.APPLICATION_JSON);
		// Response response = target.request().get();
		// MoviesByGenre out = response.readEntity(MoviesByGenre.class);
		// response.close();

		// AnnotationConfigApplicationContext ctx =
		// new AnnotationConfigApplicationContext();
		// ctx.register(ServiceConfig.class);
		// ctx.register(RepositoryConfig.class);
		// ctx.register(DomainConfig.class);
		// ctx.refresh();

		// AnnotationConfigApplicationContext context
		// = new
		// AnnotationConfigApplicationContext(ServiceConfig.class,RepositoryConfig.class,DomainConfig.class);
		//
		// FilmServiceImpl filmServiceImpl = ctx.getBean(FilmServiceImpl.class);
		// Film film;

		// for (Result apiFilm : out.getResults()) {
		// film = new Film();
		// film.setOriginalTitle(apiFilm.getOriginalTitle());
		// film.setTitle(apiFilm.getTitle());
		// film.setReleaseDate(apiFilm.getReleaseDate());
		// film.setOverview(apiFilm.getOverview());
		// film.setPoster(apiFilm.getPosterPath());
		// filmServiceImpl.save(film);
		// }
		// ctx.close();
	}

}