package com.devguy.shematoclassdefintion;

import com.devguy.jsonschematojava.Composition;
import com.devguy.jsonschematojava.Files;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Messages {


    final static Logger LOGGER = LoggerFactory.getLogger(Runner.class);

    protected Composition composition1;
    protected Composition composition2;
    protected Files files;
    final static ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

    public Messages() {
        LOGGER.debug("Init Messages");
    }

    public Composition getComposition1() {
        composition1 = new Composition();
        composition1.setMaterial(Composition.Material.BAMBOO);
        composition1.setPercentage(7.00);
        composition1.setAdditionalProperty("name", "halligalli");
        composition1.setNumber(4);
        return composition1;
    }

    public Composition getComposition2() {
        composition2 = new Composition();
        composition2.setMaterial(Composition.Material.ARAMID);
        composition2.setPercentage(8.33);
        composition2.setAdditionalProperty("name", "pumuckl");
        return composition2;
    }

    public List<Composition> getAllCompositions() {
        return Arrays.asList(getComposition1(),getComposition2());
    }


    public Files getFiles() {
        final Files files = new Files();
        files.setName("Oktberfest");
        files.setComposition(this.getAllCompositions());
        files.setVendor("Nike");
        files.setYarnType(Files.YarnType.FILAMENT_YARN);
        files.setComposition(getAllCompositions());
        files.setVendorBusinessModel(Files.VendorBusinessModel.TRADER);
        files.setAdditionalProperty("nachname", "Braun");
        return files;
    }

}


