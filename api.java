//java.net.http
HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://drug-info-and-price-history.p.rapidapi.com/1/druginfo?drug=advil"))
		.header("X-RapidAPI-Key", "d2d1fb73bemsh269481ded30e9adp1aea9djsn89398140aa56")
		.header("X-RapidAPI-Host", "drug-info-and-price-history.p.rapidapi.com")
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());