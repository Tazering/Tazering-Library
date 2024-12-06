import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> major_scales = create_scales();

        


    }


    public static Map<String, List<String>> create_scales() {
        Map<String, List<String>> major_scales = new HashMap<String, List<String>>();

        major_scales.put("E Major (G Concert)", List.of("A", "B", "C#", "D#", "E", "F#", "G#"));
        major_scales.put("A Major (C Concert)", List.of("A", "B", "C#", "D", "E", "F#", "G#"));
        major_scales.put("D Major (F Concert)", List.of("A", "B", "C#", "D", "E", "F#", "G"));
        major_scales.put("G Major (Bb Concert)", List.of("A", "B", "C", "D", "E", "F#", "G"));
        major_scales.put("C Major (Eb Concert)", List.of("A", "B", "C", "D", "E", "F", "G"));
        major_scales.put("F Major (Ab Concert)", List.of("A", "Bb", "C", "D", "E", "F", "G"));
        major_scales.put("Bb Major (Db Concert)", List.of("A", "Bb", "C", "D", "Eb", "F", "G"));
        major_scales.put("Eb Major (Gb Concert)", List.of("Ab", "Bb", "C", "D", "E", "F", "G"));
        major_scales.put("Ab Major (B Concert)", List.of("Ab", "Bb", "C", "Db", "Eb", "F", "G"));
        major_scales.put("Db Major (E Concert)", List.of("Ab", "Bb", "C", "Db", "b", "F", "Gb"));
        major_scales.put("F# Major (A Concert)", List.of("A#", "B", "C#", "D#", "E#", "F#", "G#"));
        major_scales.put("B Major (D Concert)", List.of("A#", "B", "C#", "D#", "E", "F#", "G#"));



        return major_scales;

    }
}