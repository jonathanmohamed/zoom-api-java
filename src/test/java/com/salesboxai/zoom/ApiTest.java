package com.salesboxai.zoom;

/**
 * Test the Zoom API
 */
public class ApiTest
{
	/*		outcome/
	 * Runs tests of the ZoomAPI and displays the output
	 */
	public static void main(String[] args) throws ZoomAPIException {
		getUserTest();
		scheduleMeetingTest();
	}

	/*		outcome/
	 * Get the zoom JWT token configured in `application.properties` and use it
	 * to make a zoom call and retrieve details about the current user ("me").
	 */
	static void getUserTest() throws ZoomAPIException {
		ZoomAuthorizerJWT authorizer = new ZoomAuthorizerJWT(new Config().getValue("com.salesboxai.zoom.test.jwtToken"));
		ZoomAPI za = new ZoomAPI(authorizer);
		ZoomUser user = za.getUser("me");
		System.out.println(user);
	}

	/*		outcome/
	 * Using the zoom JWT token configured in `application.properties` make
	 * a zoom call to create a new meeting for the current user.
	 */
	static void scheduleMeetingTest() throws ZoomAPIException {
		ZoomAuthorizerJWT authorizer = new ZoomAuthorizerJWT(new Config().getValue("com.salesboxai.zoom.test.jwtToken"));
		ZoomAPI za = new ZoomAPI(authorizer);
		ZoomMeetingRequest mreq = ZoomMeetingRequest.requestDefaults("Test Meeting", "Let's talk about the weather");
		ZoomMeeting meeting = za.createMeeting("me", mreq);
		System.out.println(meeting);
	}
}
