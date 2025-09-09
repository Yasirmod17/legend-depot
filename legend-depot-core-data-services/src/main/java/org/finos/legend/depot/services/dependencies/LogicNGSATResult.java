//  Copyright 2025 Goldman Sachs
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//

package org.finos.legend.depot.services.dependencies;

import org.finos.legend.depot.domain.project.ProjectVersion;
import org.logicng.formulas.Formula;
import org.logicng.formulas.FormulaFactory;
import org.logicng.formulas.Variable;

import java.util.List;
import java.util.Map;

public class LogicNGSATResult
{
    private final List<Formula> clauses;
    private final Map<String, Variable> variableMap;
    private final Map<Variable, ProjectVersion> reverseVariableMap;
    private final FormulaFactory factory;
    private final Map<Variable, Integer> weights;

    public LogicNGSATResult(List<Formula> clauses, Map<String, Variable> variableMap, Map<Variable, ProjectVersion> reverseVariableMap, FormulaFactory factory, Map<Variable, Integer> weights)
    {
        this.clauses = clauses;
        this.variableMap = variableMap;
        this.reverseVariableMap = reverseVariableMap;
        this.factory = factory;
        this.weights = weights;
    }

    // Getters
    public List<Formula> getClauses()
    {
        return clauses;
    }

    public Map<String, Variable> getVariableMap()
    {
        return variableMap;
    }

    public Map<Variable, ProjectVersion> getReverseVariableMap()
    {
        return reverseVariableMap;
    }

    public FormulaFactory getFactory()
    {
        return factory;
    }

    public Map<Variable, Integer> getWeights()
    {
        return weights;
    }
}