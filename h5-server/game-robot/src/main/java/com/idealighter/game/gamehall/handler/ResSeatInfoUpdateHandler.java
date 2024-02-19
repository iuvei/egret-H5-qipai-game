
package com.idealighter.game.gamehall.handler;

import com.idealighter.game.core.annotation.ResMsgHandler;
import com.idealighter.game.gamehall.message.ResSeatInfoUpdateMsg;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ResMessage;
import com.idealighter.game.robot.core.Player;
import com.idealighter.game.robot.handler.ResMessageHandler;


@ResMsgHandler(ModuleMsgIdConstant.Game.NOTICE_SEAT_INFO_UPDATE)
public class ResSeatInfoUpdateHandler implements ResMessageHandler {

  // private static final Logger LOG = LoggerFactory.getLogger(ResSeatInfoUpdateHandler.class);

  @Override
  public void action(Player player, ResMessage message) {
    ResSeatInfoUpdateMsg msg = (ResSeatInfoUpdateMsg) message;
    player.seatInfoUpdate(msg.getSeat());
  }
}
