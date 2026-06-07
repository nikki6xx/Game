package com.sasha.service;

import com.sasha.domain.Attributes;

public class AttributeService {

    public Attributes updateStrength(int newStrength, Attributes currentAttribute) {
        return new Attributes(newStrength, currentAttribute.getVitality());
    }

    public Attributes updateVitality(int newVitality, Attributes currentAttribute) {
        return new Attributes(newVitality, currentAttribute.getStrength());
    }


}
