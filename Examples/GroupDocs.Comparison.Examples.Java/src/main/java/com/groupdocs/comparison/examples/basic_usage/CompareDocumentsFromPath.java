package com.groupdocs.comparison.examples.basic_usage;

import com.groupdocs.comparison.Comparer;
import com.groupdocs.comparison.examples.SampleFiles;
import com.groupdocs.comparison.examples.Utils;

/**
 * This example demonstrates comparing of two documents
 */
public class CompareDocumentsFromPath {
    public static void run() throws Exception {

        String outputFileName = Utils.getOutputDirectoryPath(SampleFiles.RESULT_WORD, "CompareDocumentsFromPath");

        try (Comparer comparer = new Comparer(SampleFiles.SOURCE_WORD)) {
            comparer.add(SampleFiles.TARGET1_WORD);
            comparer.compare(outputFileName);
        }
        System.out.println("\nDocuments compared successfully.\nCheck output in " + Utils.OUTPUT_PATH + ".");
    }
}
