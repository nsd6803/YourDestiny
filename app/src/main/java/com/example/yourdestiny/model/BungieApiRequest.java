package com.example.yourdestiny.model;

import java.io.IOException;

import okhttp3.*;

public class BungieApiRequest {

    private static final String BASE_URL = "https://www.bungie.net/Platform/Destiny2/";

    public static void getWeaponInfo(String weaponHash, String apiKey) {
        String url = BASE_URL + "Manifest/DestinyInventoryItemDefinition/" + weaponHash + "/";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("X-API-Key", apiKey)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String responseBody = response.body().string();
                    if (responseBody != null && !responseBody.isEmpty()) {
                        // Process the response body
                        System.out.println(responseBody);

                    } else {
                        System.out.println("Empty response body");
                    }
                } else {
                    System.out.println("Error: " + response.code() + " - " + response.message());
                }
                response.close(); // Close the response to release resources
            }
        });
    }
}