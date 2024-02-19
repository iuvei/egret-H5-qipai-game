
package com.idealighter.game.core.service.welfare.handler;

import com.google.inject.Inject;

import com.idealighter.game.core.annotation.ReqMsgHandler;
import com.idealighter.game.core.service.player.struct.Player;
import com.idealighter.game.core.service.welfare.manager.WelfareMgr;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ReqMessage;
import com.idealighter.game.message.core.ResMessage;
import com.idealighter.game.server.handler.ReqMessageHandler;


@ReqMsgHandler(ModuleMsgIdConstant.Welfare.RECEIVE_BENEFITS)
public class ReqReceiveBenefitsHandler implements ReqMessageHandler {
  @Inject
  private WelfareMgr welfareMgr;

  @Override
  public ResMessage action(Player player, ReqMessage message) {
    // ReqReceiveBenefitsMsg msg = (ReqReceiveBenefitsMsg)message;
    welfareMgr.receiveBenefits(player);

    return null;
  }
}
