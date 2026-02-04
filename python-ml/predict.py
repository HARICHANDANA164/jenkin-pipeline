import sys
import os
import joblib

# Always resolve paths relative to THIS file
BASE_DIR = os.path.dirname(os.path.abspath(__file__))

clf = joblib.load(os.path.join(BASE_DIR, "severity_classifier.pkl"))
vec = joblib.load(os.path.join(BASE_DIR, "tfidf_vectorizer.pkl"))
le = joblib.load(os.path.join(BASE_DIR, "label_encoder.pkl"))

if len(sys.argv) < 2:
    print("Invalid input")
    sys.exit(1)

text = sys.argv[1]

X = vec.transform([text])
pred = clf.predict(X)

print(le.inverse_transform(pred)[0])
