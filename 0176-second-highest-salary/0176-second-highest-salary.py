import pandas as pd

def second_highest_salary(df: pd.DataFrame) -> pd.DataFrame:
    x = df["salary"].drop_duplicates()
    x.sort_values(inplace=True)
    if(len(x)>1):
        y = x.iloc[-2]
    else :
        y = None
    return pd.DataFrame({"SecondHighestSalary":[y]})