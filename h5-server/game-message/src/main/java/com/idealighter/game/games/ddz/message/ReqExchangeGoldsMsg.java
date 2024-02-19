
package com.idealighter.game.games.ddz.message;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import com.idealighter.game.core.annotation.ReqMsg;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ReqMessage;

import lombok.Data;

/**
 * 请求筹码兑换金币 .
 *
 */
@ReqMsg(ModuleMsgIdConstant.DDZ.EXCHANGE_GOLDS)
@Data
public class ReqExchangeGoldsMsg implements ReqMessage {
  @Protobuf(order = 1)
  private int id = ModuleMsgIdConstant.DDZ.EXCHANGE_GOLDS;
  // 兑换的金币的筹码数量
  @Protobuf(order = 2)
  private long chips;
}
