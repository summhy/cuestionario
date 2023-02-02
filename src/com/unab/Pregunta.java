package com.unab;

public class Pregunta {
	
	private String pregunta ;
	private boolean respuesta;
	
	
	
	
	public Pregunta(String pregunta, boolean respuesta) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}
	
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;	
	}
	
	/**
	 * @return retorna la pregunta del objeto, es tipo String
	 */
	public String getPregunta() {
		return this.pregunta;
	}
	
	
	
	
	

	public void setRespuesta(boolean respuesta) {
		this.respuesta = respuesta;	
	}
	
	public int validar(boolean respuesta) {
		if (respuesta == this.respuesta) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	

}
