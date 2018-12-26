package com.crossoverjie.cim.client.service;

import com.crossoverjie.cim.client.vo.req.GroupReqVO;
import com.crossoverjie.cim.client.vo.req.LoginReqVO;
import com.crossoverjie.cim.client.vo.res.CIMServerResVO;
import com.crossoverjie.cim.client.vo.res.OnlineUsersResVO;

import java.util.List;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2018/12/22 22:26
 * @since JDK 1.8
 */
public interface RouteRequest {

    /**
     * 群发消息
     * @param groupReqVO 消息
     * @throws Exception
     */
    void sendGroupMsg(GroupReqVO groupReqVO) throws Exception;

    /**
     * 获取服务器
     * @return 服务ip+port
     * @throws Exception
     */
    CIMServerResVO.ServerInfo getCIMServer(LoginReqVO loginReqVO) throws Exception;

    /**
     *
     * @return 获取所有在线用户
     */
    List<OnlineUsersResVO.DataBodyBean> onlineUsers()throws Exception ;
}
