package dev.vality.businessmetricexporter.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum MetricUnit {

    COUNT("count");

    @Getter
    private final String unit;

}

