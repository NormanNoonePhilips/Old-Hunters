package org.old_hunters.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;

import java.util.function.Consumer;

public class Old_huntersDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        // Register your providers here
        fabricDataGenerator.addProvider(MyModelProvider::new);
        fabricDataGenerator.addProvider(MyRecipeProvider::new);
        fabricDataGenerator.addProvider(MyLootTableProvider::new);
    }

    // Model provider
    private static class MyModelProvider extends FabricModelProvider {
        public MyModelProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator generator) {
            // Add your block models here
        }

        @Override
        public void generateItemModels(ItemModelGenerator generator) {
            // Add your item models here
        }
    }

    // Recipe provider
    private static class MyRecipeProvider extends FabricRecipeProvider {
        public MyRecipeProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        public void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
            // Add your recipes here
        }
    }

    // Loot table provider (custom, since FabricLootTableProvider does not exist in 1.19.2)
    private static class MyLootTableProvider implements DataProvider {
        private final FabricDataGenerator dataGenerator;

        public MyLootTableProvider(FabricDataGenerator dataGenerator) {
            this.dataGenerator = dataGenerator;
        }

        @Override
        public void run(DataWriter writer) {
            // Generate your loot tables here
        }

        @Override
        public String getName() {
            return "Old Hunters Loot Tables";
        }
    }
}
