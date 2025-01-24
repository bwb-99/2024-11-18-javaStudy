package com.sist.main;
//사원 정보
import java.util.*;
public class Emp {
	private int empno; //사번
<<<<<<< HEAD
	private String ename; // 이름
	private String job; // 직위
	private int mgr; // 사수 사번 => JOIN
	private int sal; // 급여
	private int comm; // 성과급
	private int deptno;  // 부서번호
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return ename;
	}
	public void setName(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
=======
	private String name; // 이름
	private String job; // 직위
	private int mgr; // 사수 사번 => JOIN
	private int sal; // 급여
	private int comm; // 성과급
	private int deptno;  // 부서번호
>>>>>>> refs/remotes/origin/master

}
