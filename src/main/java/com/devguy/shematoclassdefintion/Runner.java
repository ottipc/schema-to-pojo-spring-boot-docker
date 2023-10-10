package com.devguy.shematoclassdefintion;

import com.devguy.jsonschematojava.Composition;
import com.devguy.jsonschematojava.Files;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        final Composition composition1 = new Composition();
        composition1.setMaterial(Composition.Material.BAMBOO);
        composition1.setPercentage(7.00);
        composition1.setAdditionalProperty("name", "halligalli");
        composition1.setNumber(4);
        final Composition composition2 = new Composition();
        composition2.setMaterial(Composition.Material.ARAMID);
        composition2.setPercentage(8.33);
        composition2.setAdditionalProperty("name", "pumuckl");

        List<Composition> compositions = Arrays.asList(composition1, composition2);

        final Files files = new Files();
        files.setName("Oktberfest");
        files.setComposition(compositions);
        files.setVendor("Nike");
        files.setYarnType(Files.YarnType.FILAMENT_YARN);
        files.setComposition(compositions);
        files.setVendorBusinessModel(Files.VendorBusinessModel.TRADER);
        files.setAdditionalProperty("nachname", "Braun");



    }
}