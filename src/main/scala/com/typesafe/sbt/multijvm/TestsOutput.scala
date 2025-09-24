package com.typesafe.sbt.multijvm

import sbt.TestResult
import sbt.Tests.Summary

final case class TestsOutput(
    overall: TestResult,
    summaries: Iterable[Summary]
)
