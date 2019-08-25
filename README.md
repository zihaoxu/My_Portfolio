# Zihao's Portfolio
Welcome to my portfolio! This repository is designed to give you a better sense of who I am, what I am capable of, and what I am passionate about. If you are interested in learning more about me, please see my [resume](https://goo.gl/gvVqxW) or visit my [LinkedIn](https://www.linkedin.com/in/zihao-xu/). I can also be reached at zihao.xu@pomona.edu through email.

## Basic information  
### Work Experience:  
- Summer Analyst at Cornerstone Research  
- Business and Credit Risk Analyst Intern at Scratch Financial, LLC  
- Summer Researcher at Pomona College Mathematics Department  
- Research Assistant at Pomona College Economics Department  
- Quantitative Analyst Intern at Guotai Junan Securities Co., Ltd  

### Honors & Distinctions  
- April 2019 - Sigma Xi Member  
- Oct 2018 - Phi Beta Kappa (PBK) Member  
- Sept 2018 - Bruce Jay Levy Memorial Award in Mathematics  
- April 2018 - Runner-up, Best Insight Award, UCLA DataFest  
- March 2018 - First Prize, 2017 Fall USRESP Competition  
- 2015–2018 - Pomona College Scholar (Dean’s List), all semesters  

### Related Courses  
Artificial Intelligence, Algorithms, Stochastic Operations Research; [Computational Statistics](https://goo.gl/rfusFE); [Big Data](https://goo.gl/k7wRdq); [Econometrics](https://goo.gl/gqcrjv); Data Structures; Probability; Statistical Theory; Bayesian Statistics  


## Past Experiences  
### Eye-tracking with Deep Neural Networks  
In this thesis, we explore the intersection of the field of eye-tracking and the field of computer vision to build an efficient appearance-based eye-tracker using Convolutional Neural Networks (CNNs). We first build the mathematical framework of Artificial Neural Network (ANN) and transition to its variation, Convolutional Neural Networks (CNN), in addition to their training methods. Then, we provide a holistic overview of the field of eye-tracking and several distinguished existing eye-tracking tools, laying the ground work for our model. Finally, we present two CNN-based eye tracking models using the MobileNet and the ResNet50 architectures trained on dataset obtained from the WebGazer project. Through experimental results, we demonstrate that our models offer a 25\% and 10\% performance improvements measure by average euclidean distance for PC and Mac users, respectively. In addition, we show that our CNN-based models have the potential to serve as blink detectors.  
**Project Repo**: https://github.com/zihaoxu/cnn-eye-tracker  
**Full Thesis**: https://bit.ly/2NwPCjU  
**Thesis Presentation**: https://www.youtube.com/watch?v=g_ISUAHx2YA&t=191s  


### Deep Neural Networks for Object Enumeration  
Estimating object count from images is a difficult problem that has a wide range of applications. In this work, we examine the object counting problem for images from the Amazon Bin Images Dataset. This task is riddled with many challenges, including occasional low image quality, object occlusions, and diversity in objects. This work explores a deep- learning approach using a CNN architecture for this object counting problem. Our solution combines end-to-end training on ResNet with test time augmentation, achieving promising results for this difficult task.  

Keywords - Convolutional Neural Network (CNN); Amazon Bin Images Dataset; ResNet; Object Counting  

**Project Repo**: https://github.com/zihaoxu/object_enumeration_ABID  
**Project Paper**: https://bit.ly/2ZqM88G  
**Project Poster**: https://bit.ly/2Nv6w2g  

### BikeSGV  
Last semester, I represented Tech for Good, a student organization that helps local non-profits with finding technical solutions to impactful problems, as the technical lead and worked with the Bike San Gabriel Valley to help them analyze bike count data they gathered over the past few years. I led a team of 4 and together, we cleaned, wrangled and visualized the datasets and our results are featured in BikeSGV's [end-of-year report](http://www.bikesgv.org/sgvcounts.html). This semester, we will continue helping BikeSGV with several in-depth data analyses. While working on the project, you will gain hands-on experience in data cleaning, wrangling, visualization and maybe machine learning.  

**Project Repo**: https://github.com/zihaoxu/BikeSGV  

### Bayesian Neural Networks
This project is an exploration into the intersection of the Bayesian Paradigm and Deep Learning. We apply the Bayesian Neural Networks to two different tasks: a regression task using a toy dataset and a classification task using the Wine dataset obtained from UCI ML Repo.  
**Project Paper**: https://goo.gl/P1EYBu  


### Bag of Little Random Forests (BLRF)  
Random Forests are an ensemble method that utilizes a number of deci- sion trees to make robust predictions in both regression and classification settings. However, the process of bootstrap aggregation, the mechanism underlying the Random Forests algo- rithm, requires each decision tree to physically store and perform computations on data sets of the same size as the training data set. This situation is oftentimes impractical given the large size of data sets nowadays. To address this problem, we introduce the Bag of Little Ran- dom Forests (BLRF), a new algorithm that combines the Random Forests with the Bag of Little Bootstraps resampling method, aiming to achieve a better computational profile while producing predictions with comparable accuracy as those of the Random Forests. The project is submitted to the 2017 Fall Undergraduate Research Project Competition and won the first prize.  
**Project Paper**: Bag of Little Random Forests - Zihao Xu, Dr. Johanna Hardin: https://goo.gl/gJHqar  
**Project Presentation**: https://goo.gl/KJ34uY  
**Project Poster**: https://goo.gl/LmkZu4  

### Yelp Review Sentiment Analysis  
In this project, we explored and performed sentiment analysis on reviews obtained from the Yelp Data Challenge. We explored temporal trends of review sentiment as well as interesting interactions between review tags. We also build a sentiment predictor for reviews solely based on text analysis. The resulting interactive module allows us to assess the sentiment of a unlabeled piece of review text with a confidence score.  
**Project Paper**: https://goo.gl/s7K1uA  
**Project Presentation**: https://goo.gl/cMzfWB  

### KKBox Churning Prediction Kaggle Challenge  
In this project, we aim to document our methodologies in approaching the KKBox Churning Prediction Challenge. This challenge is essentially a classification problem, but the response variable is highly imbalanced. In the below sections, we will describe and visually explore the data sets. Then we will talk about several machine learning models we employed that are highly suitable for handling imbalanced data. Our current ranking on Kaggle is 136 out of 535, achieved by the XGBoost model.
**Project Paper**: https://goo.gl/en3cSV  
**Project Presentation**: https://goo.gl/YLjTv9  

### Data Science Toolbox  
Python pipelines built for summary statistics, data cleaning and machine learning & parameter tuning.  
**Link**: https://goo.gl/ADVyoY  


### Yelp - Zillow Data Analytics - jac_project   
The purpose of the project was to explore and analyze the interaction between Zillow hosing price index and Yelp restaurant ratings to identify temporal trends. We merged and integrated the datasets by geospatial locations and performed various analyses. One of our most interesting findings was that, the most expensive restaurants, if located at a relative poor neighborhood, have experienced a significant decreasing trend in rating; however, the ratings remained constant for those located at a relatively rich neighborhood.  
**Visualizations:**  https://goo.gl/CvJefP  


### Statsketball Challenge - ASA  
In this project, we aim to predict 2017 NCAA March Madness basketball game results using Support Vector Machine. We scraped data from two sources: Kenpom and Sport-references, cleaned and wrangled the data, and trained a SVM model to predict the actual game results, yielding a accuracy of 84.375% on out of sample data.  
**Project Summary:**  https://goo.gl/fEBRNx  

### Expedia Challenge - UCLA DataFest  
Using the dataset from Expedia, we segmented the market by families with varying number of children and explored the different behaviors of these segments. Using visualization techniques like heatmap and geomap, we were able to discover differences in travel planning habits, popular destinations of each group, as well as identifying the geographical distribution of large/small families to allow for better targeted promotion.  
**Project Presentation:**  https://goo.gl/4MmRJx  




