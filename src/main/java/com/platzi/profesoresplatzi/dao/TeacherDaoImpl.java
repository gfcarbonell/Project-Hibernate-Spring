package com.platzi.profesoresplatzi.dao;

import java.util.List;

import com.platzi.profesoresplatzi.model.Teacher;


public class TeacherDaoImpl extends AbstractSession implements TeacherDao {
	
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		getSession().persist(teacher);
	}

	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
		Teacher teacher = findById(idTeacher);
		if (teacher != null) {
			getSession().delete(teacher);
		}
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		getSession().update(teacher);
	}

	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Teacher").list();
	}

	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return (Teacher) getSession().get(Teacher.class, idTeacher);
	}

	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return (Teacher) getSession().createQuery(
				"from Teacher where name = :name")
				.setParameter("name", name).uniqueResult();
	}

}
