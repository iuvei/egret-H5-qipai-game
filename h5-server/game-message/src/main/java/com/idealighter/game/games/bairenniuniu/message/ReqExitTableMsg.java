
package com.idealighter.game.games.bairenniuniu.message;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import com.idealighter.game.core.annotation.ReqMsg;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ReqMessage;

import lombok.Data;

/**
 * 玩家请求退出房间牌桌 .
 *
 */
@ReqMsg(ModuleMsgIdConstant.BaiRenNiuNiu.EXIT_TABLE)
@Data
public class ReqExitTableMsg implements ReqMessage {
  @Protobuf(order = 1)
  private int id = ModuleMsgIdConstant.BaiRenNiuNiu.EXIT_TABLE;
}
