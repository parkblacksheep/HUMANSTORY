package org.hs.service;

import java.util.List;

import org.hs.domain.Criteria;
import org.hs.domain.LeavePolicyAttachVO;
import org.hs.domain.LeavePolicyVO;

public interface LeavePolicyService {
	public void registerLeavePolicy(LeavePolicyVO vo);

	public List<LeavePolicyVO> getLeavePolicyCharts(Criteria cri);

	public LeavePolicyVO getLeavePolicyOne(int lpNum);

	public int modifyLeavePolicy(LeavePolicyVO vo);

	public int removeLeavePolicy(int lpNum);

	public int listTotal(Criteria cri);
	
	public List<LeavePolicyAttachVO> getAttachList(int lpNum);

}
