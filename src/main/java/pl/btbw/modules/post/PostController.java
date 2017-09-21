package pl.btbw.modules.post;

import io.swagger.annotations.Api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/post")
@Api(value = "post")
public class PostController {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public PostDto getAction() {
		return new PostDto().setId(1).setTitle("Lorem Ipsum");
	}

	@GET
	@Path("/filter")
	@Produces(MediaType.APPLICATION_JSON)
	public PostDto getActionWithQueryParam(@QueryParam("type") String type, @QueryParam("category") Integer category) {
		return new PostDto().setId(1).setTitle("Lorem Ipsum");
	}

	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response postAction(PostDto dto) {
		return Response.ok().build();
	}
}
