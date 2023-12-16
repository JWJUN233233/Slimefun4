package city.norain.slimefun4.utils;

import io.papermc.lib.PaperLib;
import javax.annotation.Nonnull;
import org.bukkit.plugin.Plugin;

/**
 * LangUtil
 * <p>
 * 将部分无法直接汉化的方法提取出来
 *
 * @author StarWishsama
 */
public class LangUtil {
    /**
     * 推荐你使用 Paper 服务端
     *
     * @param plugin
     */
    public static void suggestPaper(@Nonnull Plugin plugin) {
        if (PaperLib.isPaper()) {
            return;
        }
        final var benefitsProperty = "paperlib.shown-benefits";
        final var pluginName = plugin.getDescription().getName();
        final var logger = plugin.getLogger();
        logger.warning("====================================================");
        logger.warning(" " + pluginName + "works better on Paper ");
        logger.warning(" We suggest you use Paper ");
        if (System.getProperty(benefitsProperty) == null) {
            System.setProperty(benefitsProperty, "1");
            logger.warning("  ");
            logger.warning(" Paper greatly improves performance and it's safer");
            logger.warning(" and fix plenty of bugs");
            logger.warning(" 提升服主的服务器体验.");
            logger.warning("  ");
            logger.warning(" Paper uses Timings v2. Compared with v1 ");
            logger.warning(" 能够更显著地诊断服务器卡顿原因.");
            logger.warning("  ");
            logger.warning(" 你原有的插件在更换后大部分都能正常使用.");
            logger.warning(" 如果遇到问题, Paper 社区很乐意帮助你解决你的问题.");
            logger.warning("  ");
            logger.warning(" 加入 Paper 社区 @ https://papermc.io");
        }
        logger.warning("====================================================");
    }
}
