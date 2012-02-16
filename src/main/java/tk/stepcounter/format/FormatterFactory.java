package tk.stepcounter.format;

/**
 * �t�H�[�}�b�^�̃C���X�^���X���쐬���邽�߂̃t�@�N�g���N���X�B
 */
public class FormatterFactory {

	/**
	 * �t�H�[�}�b�^�̃C���X�^���X�𐶐����܂��B
	 *
	 * @param format �t�H�[�}�b�g
	 * @return �t�H�[�}�b�^�̃C���X�^���X
	 */
	public static ResultFormatter getFormatter(String format){
		// null�̏ꍇ�̓f�t�H���g�t�H�[�}�b�g
		if(format==null){
			return new DefaultFormatter();
		}
		String name = format.toLowerCase();
		// CSV�t�H�[�}�b�g
		if(name.equals("csv")){
			return new CSVFormatter();

		// Excel�t�H�[�}�b�g
		} else if(name.equals("excel")){
			return new ExcelFormatter();

		// �f�t�H���g�t�H�[�}�b�g
		} else {
			return new DefaultFormatter();
		}
	}

}