package com.groupdocs.comparison.examples.basic_usage;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.examples.SampleFiles;
import com.groupdocs.comparison.examples.Utils;

/**
 * This example demonstrates comparing of two cells files
 */
public class CompareCellsFromPath {
    public static void run() throws Exception {

        String outputFileName = Utils.getOutputDirectoryPath(SampleFiles.RESULT_CELLS, "CompareCellsFromPath");

        try (Comparer comparer = new Comparer(SampleFiles.SOURCE_CELLS)) {
            comparer.add(SampleFiles.TARGET_CELLS);
            comparer.compare(outputFileName);
        }
        System.out.println("\nDocuments compared successfully.\nCheck output in " + Utils.OUTPUT_PATH + ".");
    }
}
