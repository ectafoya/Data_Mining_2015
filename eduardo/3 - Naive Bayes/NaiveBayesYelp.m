% Naive Bayes Classification
% create classifier: nb = NaiveBayes.fit(data, labels, 'distance', 'kernel')
% use the classifier created above on test data
% create confusion matrix to visualize performance of the algorithm
% Last modified 3/24/2015

clc;

trainingData = dlmread('Yelp\9trainingData.txt');
display('after reading training data');
trainingLabels = dlmread('Yelp\9trainingLabels.txt');
display('after reading training labels');
testData = dlmread('Yelp\9testData.txt');
display('after reading testData');
testLabels = dlmread('Yelp\9testLabels.txt');
display('after reading testLabels');

nb = NaiveBayes.fit(trainingData, trainingLabels, 'dist', 'kernel');
display('after creating the classifier');
predictedLabels = nb.predict(testData);
display('after predicting the labels');
confusionMatrix = confusionmat(testLabels, predictedLabels);
display('after computing the confusion matrix');
