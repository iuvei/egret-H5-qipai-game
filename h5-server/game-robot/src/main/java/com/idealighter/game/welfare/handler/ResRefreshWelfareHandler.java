
package com.idealighter.game.welfare.handler;

import com.idealighter.game.core.annotation.ResMsgHandler;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ResMessage;
import com.idealighter.game.robot.core.Player;
import com.idealighter.game.robot.handler.ResMessageHandler;


@ResMsgHandler(ModuleMsgIdConstant.Welfare.NOTICE_REFRESH_WELFARE)

public class ResRefreshWelfareHandler implements ResMessageHandler {

  // private static final Logger LOG = LoggerFactory.getLogger(ResRefreshWelfareHandler.class);

  @Override
  public void action(Player player, ResMessage message) {
    // ResRefreshWelfareMsg msg = (ResRefreshWelfareMsg) message;

  }
}
