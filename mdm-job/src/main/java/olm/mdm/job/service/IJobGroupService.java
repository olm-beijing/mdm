package olm.mdm.job.service;

import olm.mdm.job.domain.JobGroup;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-10-08
 */
public interface IJobGroupService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public JobGroup selectJobGroupById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param jobGroup 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<JobGroup> selectJobGroupList(JobGroup jobGroup);

    /**
     * 新增【请填写功能名称】
     * 
     * @param jobGroup 【请填写功能名称】
     * @return 结果
     */
    public int insertJobGroup(JobGroup jobGroup);

    /**
     * 修改【请填写功能名称】
     * 
     * @param jobGroup 【请填写功能名称】
     * @return 结果
     */
    public int updateJobGroup(JobGroup jobGroup);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteJobGroupByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteJobGroupById(Long id);
}
