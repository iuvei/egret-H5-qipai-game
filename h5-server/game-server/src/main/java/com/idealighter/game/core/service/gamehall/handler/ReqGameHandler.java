
package com.idealighter.game.core.service.gamehall.handler;

import com.google.inject.Inject;

import com.idealighter.game.core.annotation.ReqMsgHandler;
import com.idealighter.game.core.service.gamehall.manager.GameHallMgr;
import com.idealighter.game.core.service.player.struct.Player;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ReqMessage;
import com.idealighter.game.message.core.ResMessage;
import com.idealighter.game.server.handler.ReqMessageHandler;


@ReqMsgHandler(ModuleMsgIdConstant.Game.GAME_LIST)
public class ReqGameHandler implements ReqMessageHandler {

  @Inject
  private GameHallMgr gameHallMgr;

  @Override
  public ResMessage action(Player player, ReqMessage message) {
    return gameHallMgr.getGameList();
  }
}
