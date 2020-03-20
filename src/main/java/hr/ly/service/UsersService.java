package hr.ly.service;

import java.util.List;

import hr.entity.Users;
import hr.util.MyPage;

public interface UsersService {

	//��¼�������û��������ѯ�û�����
	Users selectUsersByUser(Users user); 
	
	//��ҳ��ѯ
	List<Users> selectUserRole(MyPage page);
	
	//��ѯһ����������
	Integer selectUserCount();
	
	//����û�
	int insertUser(Users user);
	
	//����idɾ���û�
	int deleteUser(int id);
}
