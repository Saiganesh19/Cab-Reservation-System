package cts.models;

public class JwtValidationResponseDTO {
	
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public JwtValidationResponseDTO(boolean status) {
		super();
		this.status = status;
	}

	public JwtValidationResponseDTO() {
		super();
	}

}
