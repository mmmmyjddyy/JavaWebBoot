package com.chzu.activiti.service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @ClassName WorkFlowService
 * @Description 工作流服务
 * @Author FLZ
 * @Date 2020/3/19 16:26
 * @Version 1.0
 */
public interface WorkFlowService{
    /**
     * 启动流程
     * @param pdKey
     * @param businessKey
     * @param variables
     * @return
     */
    String startWorkflow(String pdKey, String businessKey, Map<String,Object> variables);

    /**
     * 继续流程
     * @param taskId
     * @param variables
     */
    void continueWorkflow(String taskId, Map variables);

    /**
     * 委托流程
     * @param taskId
     * @param variables
     */
    void delegateWorkflow(String taskId, Map variables);

    /**
     * 结束流程(一般不使用，让流程正常结束)
     * @param pProcessInstanceId
     */
    void endWorkflow(String pProcessInstanceId,String deleteReason);

    /**
     * 获取当前的任务节点
     * @param pProcessInstanceId
     */
    String getCurrentTask(String pProcessInstanceId);


    /**
     * 查询用户待办流程实例ID集合
     * @param userId
     * @param pdKey
     * @return
     */
    List<String> findUserProcessIds(String userId, String pdKey, Integer pageNo, Integer pageSize);

    /**
     * 获取流程图像，已执行节点和流程线高亮显示
     */
    void getProcessImage(String pProcessInstanceId, HttpServletResponse response);
}
