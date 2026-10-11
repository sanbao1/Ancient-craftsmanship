SlimefunItemStack whiteStone = new SlimefunItemStack(
        "WHITESTONE",                       
        Material.WHITE_DYE,                    
        "白石",                          
        "本附属最基础的材料，可以制作大多数东西"             
);
SlimefunItemStack whiteStoneplus = new SlimefunItemStack(
        "WHITESTONEPLUS"，                      
        new CustomItemStack(Material.WHITE_DYE, meta -> {
            meta.setDisplayName("§d浓缩白石");            
            meta.setLore(java.util.List.of("把64个白石浓缩在一起，有什么好处？"));
            meta.addEnchant(Enchantment.LUCK, 1, true);    
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);     
        })            
);
SlimefunItemStack colorfulstone = new SlimefunItemStack(
        "COLORFULSTONE",                       
        new CustomItemStack(Material.PINK_DYE, meta -> {
            meta.setDisplayName("§d五彩缤纷的石头");            
            meta.setLore(java.util.List.of("白石染那么多遍何意味"));
            meta.addEnchant(Enchantment.LUCK, 1, true);    
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);     
        })                      
);
SlimefunItemStack colorstar = new SlimefunItemStack(
        "COLORSTAR",                       
        Material.FIREWORK_STAR,                    
        "颜色核心",                          
        "放入颜色凝聚台后，可源源不断的生成染料！"             
);
SlimefunItemStack colorCondenser = new SlimefunItemStack(
        "COLOR_CONDENSER",
        Material.BLAST_FURNACE,
        "&5颜色凝聚台",
        "",
        "&7将颜色核心凝聚成染料",
        "&7持续工作，源源不断",
        "",
        "&e⚡ &76 J/tick"
);
