package hr.ly.service;

import java.util.List;

import hr.entity.SysRight;

public interface SysRightService {

	//��ѯ����Ȩ��
	List<SysRight> selectAllSysRight();
	
	//��ѯ��ǰ�û���ʹ��Ȩ��
	List<SysRight> selectAllSysRightByUser(Integer id);
}
