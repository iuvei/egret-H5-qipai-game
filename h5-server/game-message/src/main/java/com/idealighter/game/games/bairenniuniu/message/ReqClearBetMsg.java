
package com.idealighter.game.games.bairenniuniu.message;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import com.idealighter.game.core.annotation.ReqMsg;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ReqMessage;

import lombok.Data;

/**
 * 清空下注 .
 *
 */
@ReqMsg(ModuleMsgIdConstant.BaiRenNiuNiu.CLEAR_BET)
@Data
public class ReqClearBetMsg implements ReqMessage {
  @Protobuf(order = 1)
  private int id = ModuleMsgIdConstant.BaiRenNiuNiu.CLEAR_BET;
}
