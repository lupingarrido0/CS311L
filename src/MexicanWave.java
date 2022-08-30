public class MexicanWave {

    public static String[] wave(String mString) {
        mString = mString.toLowerCase();
        int seatCount = countSeat(mString);
        String[] wave = new String[seatCount];
        for (int waveIndex = 0, seatIndex = 0; waveIndex < wave.length; waveIndex++, seatIndex++) {
            char seat = mString.charAt(seatIndex);
            while (Character.isWhitespace(seat)) {
                seat = mString.charAt(++seatIndex);
            }
            StringBuilder mWaveStringBuilder = new StringBuilder(mString);
            mWaveStringBuilder.setCharAt(seatIndex, Character.toUpperCase(seat));
            wave[waveIndex] = mWaveStringBuilder.toString();
        }
        return wave;
    }

    private static int countSeat(String seatString) {
        int mSpaceCount = (int) seatString.codePoints().filter(Character::isWhitespace).count();
        return seatString.length() - mSpaceCount;
    }

}