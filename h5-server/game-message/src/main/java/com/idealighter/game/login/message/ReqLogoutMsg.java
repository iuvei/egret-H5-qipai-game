package com.idealighter.game.login.message;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

import com.idealighter.game.core.annotation.ReqMsg;
import com.idealighter.game.message.ModuleMsgIdConstant;
import com.idealighter.game.message.core.ReqMessage;

import lombok.Data;

/**
 * 玩家退出登录.
 * 
 * @author messageGenerator
 *
 */
@ReqMsg(ModuleMsgIdConstant.Account.LOGOUT)
@Data
public class ReqLogoutMsg implements ReqMessage {
  @Protobuf(order = 1)
  private int id = ModuleMsgIdConstant.Account.LOGOUT;
}
