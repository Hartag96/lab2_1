package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @Test
    public void OneElementSequenceValueInSequence() {
        int [] seq = {1};
        int value = 1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertEquals(searchResult.isFound(), true);
    }

}
