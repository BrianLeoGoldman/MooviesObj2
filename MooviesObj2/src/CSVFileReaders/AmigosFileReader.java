package CSVFileReaders;

import fileReaderManager.AmigosData;

public class AmigosFileReader extends CSVFileReader<AmigosData> {

    /**
     * @param filePath the absolute path of the file to be read.
     */
    public AmigosFileReader(String filePath) {
        super(filePath);
    }

    @Override
    protected AmigosData parseLine(String[] line) {
    	int userA 	= Integer.parseInt(line[0]);
        int userB	= Integer.parseInt(line[1]);
    	
        return new AmigosData(userA, userB);
    }

    @Override
    protected String getSeparator() {
        return "\\|";
    }
}