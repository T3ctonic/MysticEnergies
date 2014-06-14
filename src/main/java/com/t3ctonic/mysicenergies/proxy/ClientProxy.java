package com.t3ctonic.mysicenergies.proxy;

import com.t3ctonic.mysicenergies.Util;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy
{
    public void renderEntity()
    {
        RenderingRegistry.registerEntityRenderingHandler(Util.getClasses()[0], (RenderLiving) Util.getObjects()[0]);
    }

    public void renderTileEntity()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(Util.getClasses()[1], (TileEntitySpecialRenderer) Util.getObjects()[1]);
    }

    public void renderItem()
    {
        MinecraftForgeClient.registerItemRenderer((Item) Util.getObjects()[2], (IItemRenderer) Util.getObjects()[3]);
    }
}
