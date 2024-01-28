package crystalspider.pyrotechnic_elytra;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class ModLoader {
  public ModLoader(IEventBus bus) {
    CommonClass.init();
  }
}