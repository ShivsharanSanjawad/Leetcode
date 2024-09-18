import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    d= {}
    d["student_id"] = [] 
    d["age"] = [] 
    for i in range(len(student_data)):
        d["student_id"].append((student_data[i][0]))
        d["age"].append((student_data[i][1]))
    return pd.DataFrame(d)
