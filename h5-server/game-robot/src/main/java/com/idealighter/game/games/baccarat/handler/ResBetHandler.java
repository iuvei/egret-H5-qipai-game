
package com.idealighter.game.games.baccarat.handler;

import com.idealighter.game.core.annotation.ResMsgHandler;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ResMessage;
import com.idealighter.game.robot.core.Player;
import com.idealighter.game.robot.handler.ResMessageHandler;


@ResMsgHandler(ModuleMsgIdConstant.Baccarat.BET)

public class ResBetHandler implements ResMessageHandler {

  // private static final Logger LOG = LoggerFactory.getLogger(ResBetHandler.class);

  @Override
  public void action(Player player, ResMessage message) {
    // ResBetMsg msg = (ResBetMsg) message;

  }
}
