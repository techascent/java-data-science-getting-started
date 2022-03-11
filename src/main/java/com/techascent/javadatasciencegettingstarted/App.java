package com.techascent.javadatasciencegettingstarted;

import static tech.v3.Clj.*;
import static tech.v3.TMD.*;
import static tech.v3.datatype.Stats.*;

import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
	// Obtain and print a sample of ten rows of the dataset
	Map ds = makeDataset("https://github.com/scicloj/metamorph-examples/raw/main/data/titanic/train.csv");
        System.out.println(sample(ds, 10));

	// What fraction of passengers survived?
	double survivors = sum(column(ds, "Survived"));
	System.out.println(String.format("%s out of %s passengers survived.", survivors, rowCount(ds)));

	// Produce two new datasets by grouping the original by "Sex"
	Map groups = groupByColumn(ds, "Sex");
	Map males = (Map)groups.get("male");
	Map females = (Map)groups.get("female");

	// Calculate survival statistics over the two new datasets
	double maleSurvivors = sum(column(males, "Survived"));
	double femaleSurvivors = sum(column(females, "Survived"));
	System.out.println(String.format("%s out of %s males survived.", maleSurvivors, rowCount(males)));
	System.out.println(String.format("%s out of %s females survived.", femaleSurvivors, rowCount(females)));

	// Save new datasets in JSON format
	writeDataset(males, "males.json");
	writeDataset(females, "females.json");

	shutdownAgents();
    }
}
