package org.mnr.actionforms;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class RegisterForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String age;
	private String gender;
	private String maritalStatus = "U";
	private String qualifications;
	private String[] courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		/**
		 * This method is used to reset values of formbean on jsp incase
		 * formbean is session scoped. If you don't wish to override this
		 * method, then change formbean scope to request. If this method is
		 * overriden, then set its values to default values
		 */
		super.reset(mapping, request);
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		System.out.println(this.toString());
		ActionErrors errors = new ActionErrors();
		if (("".equals(name)) || name == null) {
			errors.add("name.required", new ActionMessage("errors.required",
					"Name"));
		}
		if (("".equals(age)) || age == null) {
			errors.add("age.required", new ActionMessage("errors.required",
					"Age"));
		}
		if (("".equals(gender)) || gender == null) {
			errors.add("gender.required", new ActionMessage("errors.required",
					"Gender"));
		}
		if (("".equals(maritalStatus)) || maritalStatus == null) {
			errors.add("maritalStatus.required", new ActionMessage(
					"errors.required", "Marital Status"));
		}
		if (("".equals(qualifications)) || qualifications == null) {
			errors.add("qualifications.required", new ActionMessage(
					"errors.required", "Qualifications"));
		}
		if ((courses == null || courses.length == 0)) {
			errors.add("courses.required", new ActionMessage("errors.required",
					"Courses"));
		}

		return errors;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegisterForm [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", maritalStatus=");
		builder.append(maritalStatus);
		builder.append(", qualifications=");
		builder.append(qualifications);
		builder.append(", courses=");
		builder.append(Arrays.toString(courses));
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + Arrays.hashCode(courses);
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result
				+ ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((qualifications == null) ? 0 : qualifications.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegisterForm other = (RegisterForm) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (!Arrays.equals(courses, other.courses))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qualifications == null) {
			if (other.qualifications != null)
				return false;
		} else if (!qualifications.equals(other.qualifications))
			return false;
		return true;
	}

}
