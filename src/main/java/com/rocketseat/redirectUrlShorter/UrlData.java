package com.rocketseat.redirectUrlShorter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class UrlData {

    private String originalUrl;
    private long expirationTime;
}
