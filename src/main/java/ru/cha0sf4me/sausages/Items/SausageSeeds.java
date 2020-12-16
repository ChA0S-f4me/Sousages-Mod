package ru.cha0sf4me.sausages.Items;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import ru.cha0sf4me.sausages.register.BlocksRegistry;
import ru.cha0sf4me.sausages.Main;

public class SausageSeeds extends ItemSeeds {
    public SausageSeeds(String name) {
        super(BlocksRegistry.CROP_CORN, Blocks.FARMLAND);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.modTab);
    }
}
