package com.users.app.dto;

import com.users.app.enums.Specialization;
import com.users.app.model.Doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorAvailabilityDto {
	public DoctorAvailabilityDto(String string, String string2, Specialization cardiology) {
		this.doctorId = string;
		this.doctorName = string2;
		this.specialization = cardiology;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Specialization getSpecialization() {
		return specialization;
	}
	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}
	private String doctorId;
	private String doctorName;
	private Specialization specialization;

	public static DoctorAvailabilityDto fromEntity(Doctor doctor) {
        return new DoctorAvailabilityDto(doctor.getDoctorId(),doctor.getName(), doctor.getSpecialization());
    }
}