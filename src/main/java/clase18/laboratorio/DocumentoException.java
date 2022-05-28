package clase18.laboratorio;

import java.util.Arrays;

public class DocumentoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private int codigo;

	public DocumentoException(int codigo) {
		super();
		this.codigo = codigo;
	}

	public DocumentoException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		switch (this.codigo) {
		case 1:
			return "Los Documentos validos son " + Arrays.toString(TipoDocumentoValidos.values());

		default:
			return super.getMessage();
		}
	}

}
