package com.pierprogramm.training.junit.codewars.mathtools;

import java.util.ArrayList;
import java.util.List;

public class MathTools {
    public MathTools(float number){
        this.number = number;
    }

    private float number;

    public List<Integer> primeGenerator(){
        List<Integer> returnArray = new ArrayList<Integer>();
        int index = 0;
        for(int i=2; i<= number; i++){
            boolean flag = true;
            for (int j=2; j < i; j++){
                if (i % j==0){
                    flag = false;
                }
            }
            if (flag){
                returnArray.add(index, i);
                index++;
            }
        }

        return returnArray;
    }

    public List<Integer> factorGenerator(){
        List<Integer> returnArray = new ArrayList<Integer>();

        for(int i=0; number>1; i++){
            int index = 0;
            boolean flag = true;
            for (int j=2; j < i; j++){
                if (i % j==0){
                    flag = false;
                }
                if (flag){
                    if (number % j==0){
                        number = number / j;
                        returnArray.add(index, j);
                        index++;
                    }
                }
            }
        }

        return returnArray;
    }

    /*
        function factorGenerator(){
		$returnArray = array();
        $index = 0;

		$i=2;
		while ($this->number>1){
		    $flag = true;
		    for ($j=2; $j < $i; $j++){
				if ($i % $j==0){
				    $flag = false;
				}
				if ($flag==true){
				    if ($this->number % $j==0){
						$this->number = $this->number / $j;
						$returnArray[ $index ] = $j;
						$index++;
				    }
				}
		    }
			$i++;
		}
		return $returnArray;
    }
    */


}




/*
*
*
class MathTools{

    function __construct($number){
		$this->number = $number;
    }

    private $number;

    function checkRightness(){
		if($this->number==""){
            echo 'Errore campo numero vuoto' ;
            return false;
        }
		else{
            if (!is_numeric($this->number)){
                echo 'Errore campo numero non e\' un numero';
                return false;
            }
		    else{
				if($this->number < 0){
				    echo 'Errore i numeri negativi non sono accettati';
				    return false;
				}
				$number = $this->number;
				$this->number = (int) $this->number;
				return true;
		    }
        }
    }


    function primeGenerator(){
        $returnArray = array();
        $index = 0;
        for ($i=2; $i <= $this->number; $i++){
		    $flag = true;
		    for ($j=2; $j < $i; $j++){
				if ($i % $j==0){
				    $flag = false;
				}
		    }
		    if ($flag==true){
                $returnArray[ $index ] = $i;
                $index++;
            }
		}

        return $returnArray;
    }


    function factorGenerator(){
		$returnArray = array();
        $index = 0;

		$i=2;
		while ($this->number>1){
		    $flag = true;
		    for ($j=2; $j < $i; $j++){
				if ($i % $j==0){
				    $flag = false;
				}
				if ($flag==true){
				    if ($this->number % $j==0){
						$this->number = $this->number / $j;
						$returnArray[ $index ] = $j;
						$index++;
				    }
				}
		    }
			$i++;
		}
		return $returnArray;
    }
}
*
*
* */